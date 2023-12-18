import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Zahyo> zahyoList = new ArrayList<>();

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            Zahyo zahyo = new Zahyo(x, y);
            zahyoList.add(zahyo);
            minX = Math.min(minX, x);
            minY = Math.min(minY, y);
            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }
        sc.close();

        boolean[][] zahyoSetNoKawari = new boolean[maxX-minY+1][maxX-minY+1];
        
        for(Zahyo zahyo:zahyoList) {
            zahyoSetNoKawari[zahyo.x-minX][zahyo.y-minY] = true;
        }
        for (int i = 0; i < zahyoList.size(); i++) {
            Zahyo zahyoI = zahyoList.get(i);
            for (int j = i + 1; j < zahyoList.size(); j++) {
                Zahyo zahyoJ = zahyoList.get(j);

                if (zahyoI.x == zahyoJ.x || zahyoI.y == zahyoJ.y) {
                    continue;
                }

                if (zahyoSetNoKawari[zahyoI.x-minX][zahyoJ.y-minY]) {
                    if (zahyoSetNoKawari[zahyoJ.x-minX][zahyoI.y-minY]) {
                        continue;
                    } else {
                        zahyoList.add(new Zahyo(zahyoJ.x, zahyoI.y));
                        zahyoSetNoKawari[zahyoJ.x-minX][zahyoI.y-minY] = true;
                    }
                } else {
                    if (zahyoSetNoKawari[zahyoJ.x-minX][zahyoI.y-minY]) {
                        zahyoList.add(new Zahyo(zahyoI.x, zahyoJ.y));
                        zahyoSetNoKawari[zahyoI.x-minX][zahyoJ.y-minY] = true;
                    } else {
                        continue;
                    }
                }
            }
        }

        System.out.println(zahyoList.size() - N);
    }

    private static class Zahyo {
        int x;
        int y;

        public Zahyo(int x, int y) {
            super();
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + x;
            result = prime * result + y;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Zahyo other = (Zahyo) obj;
            if (x != other.x)
                return false;
            if (y != other.y)
                return false;
            return true;
        }

    }

}
