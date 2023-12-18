import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int n = scanner.nextInt();

        List<Magic> magics = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            magics.add(new Magic(a,b));
        }

        Collections.sort(magics, new Comparator<Magic>() {
            @Override
            public int compare(Magic o1, Magic o2) {
                return Double.compare(o2.getRate(), o1.getRate());
            }
        });

        int consumption = 0;
        while (h > 0){
            Magic magic = magics.get(0);

            if (h >= magic.getA()){
//                magic = magic;
            }else{
                Magic rate = magic;
                Magic min = null;
                for(Magic m : magics){
                    if(m.getA() >= h && rate.getB() > m.getB()){
                        rate = m;
                    }
                }
                for(Magic m : magics){
                    if(m.getA() < h){
                        if(min == null) {
                            min = m;
                        }else if(min.getRate() < m.getRate()){
                            min = m;
                        }
                    }
                }

                if(min != null && rate.getB() > min.getB()){
                    magic = min;
                }else{
                    magic = rate;
                }
            }

            h = h - magic.getA();
            consumption += magic.getB();
        }

        System.out.println(consumption);
    }

    static class Magic{
        int a = 0;
        int b = 0;
        double rate = 0.0;

        public Magic(int a, int b){
            this.a = a;
            this.b = b;
            rate = ((double)a) / b;
        }

        public int getA(){
            return this.a;
        }

        public int getB(){
            return this.b;
        }

        public double getRate(){
            return this.rate;
        }
    }
}