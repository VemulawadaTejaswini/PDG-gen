import java.util.*;

public class Main {

    public static void main(String[] args) {

        // read n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // read coords
        LinkedList<Coord> nzlist = new LinkedList<Coord>();
        LinkedList<Coord>  zlist = new LinkedList<Coord>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int h = sc.nextInt();
            if (h != 0){
                nzlist.add(new Coord(x,y,h));
            } else {
                 zlist.add(new Coord(x,y,h));
            }
        }

        LinkedList<Coord> alllist = (LinkedList<Coord>) nzlist.clone();
        alllist.addAll(zlist);

        // 1 <= N <= 100 なので nzlist は empty でない


        // search
        boolean okFlag = false;
        Coord center = new Coord(-1,-1,-1);
        for (int x=0; x<=100; x++) {
            for (int y = 0; y<=100; y++) {
                // h-coord: (x,y)
                Coord c = nzlist.get(0); // Warning: unchecked
                int h = c.h+Math.abs(c.x-x)+Math.abs(c.y-y);
                center = new Coord(x,y,h);

                okFlag = true;
                for (Coord e : alllist){
                    if (e.h != Math.max(h-Math.abs(x-e.x)-Math.abs(y-e.y), 0)){
                        okFlag = false;
                        break;
                    }
                }
                if(okFlag){break;}
            }
            if(okFlag){break;}
        }

        System.out.print(center.show()+"\n");
    }


}


class Coord{

    public int x;
    public int y;
    public int h;

    Coord(int x, int y, int h){
        this.x = x;
        this.y = y;
        this.h = h;
    }

    public String show(){
        return String.valueOf(x)+' '+String.valueOf(y)+' '+String.valueOf(h);
    }

}

