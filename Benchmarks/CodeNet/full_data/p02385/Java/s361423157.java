import java.io.*;
import java.util.Arrays;

class dice4{
    public static void main(String[] args) throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        Dice[] dice = new Dice[2];
        dice[0] = new Dice(br.readLine());
        dice[1] = new Dice(br.readLine());
        if(Compare.compare(dice[0],dice[1]) )System.out.println("Yes");
        else System.out.println("No");
    }
}


class Dice {
    public int[] plane = new int[6];
    int tmp = -1;

    Dice(String all){
        String name[] = all.split(" ");
        for (int i=0; i<6; ++i) {
            plane[i] = Integer.parseInt(name[i]);
        }
    }

    public void east(){
      tmp = plane[0];
      plane[0] = plane[3];
      plane[3] = plane[5];
      plane[5] = plane[2];
      plane[2] = tmp;
    }

    public void north(){
      tmp = plane[0];
      plane[0] = plane[1];
      plane[1] = plane[5];
      plane[5] = plane[4];
      plane[4] = tmp;
    }

    public void south(){
      tmp = plane[0];
      plane[0] = plane[4];
      plane[4] = plane[5];
      plane[5] = plane[1];
      plane[1] = tmp;
    }

    public void west(){
      tmp = plane[0];
      plane[0] = plane[2];
      plane[2] = plane[5];
      plane[5] = plane[3];
      plane[3] = tmp;
    }

    public void spin(){
      tmp = plane[1];
      plane[1] = plane[2];
      plane[2] = plane[4];
      plane[4] = plane[3];
      plane[3] = tmp;
    }

}

class Compare {
    public static boolean compare(Dice d1, Dice d2){
        if(check(d1,d2)) return true;
        for (int i=0; i<3; ++i) {
            d2.spin();
            if(check(d1,d2)) return true;
        }
        d2.west();
        if(check(d1,d2)) return true;
        for (int i=0; i<3; ++i) {
            d2.spin();
            if(check(d1,d2)) return true;
        }
        d2.east();
        if(check(d1,d2)) return true;
        for (int i=0; i<3; ++i) {
            d2.spin();
            if(check(d1,d2)) return true;
        }
        d2.north();
        if(check(d1,d2)) return true;
        for (int i=0; i<3; ++i) {
            d2.spin();
            if(check(d1,d2)) return true;
        }
        d2.west();
        if(check(d1,d2)) return true;
        for (int i=0; i<3; ++i) {
            d2.spin();
            if(check(d1,d2)) return true;
        }
        d2.west();
        if(check(d1,d2)) return true;
        for (int i=0; i<3; ++i) {
            d2.spin();
            if(check(d1,d2)) return true;
        }

        return false;
    }
    public static boolean check(Dice d1, Dice d2){
        if(d1.plane[0] == d2.plane[0] && d1.plane[1] == d2.plane[1] && d1.plane[2] == d2.plane[2] && d1.plane[3] == d2.plane[3] && d1.plane[4] == d2.plane[4] && d1.plane[5] == d2.plane[5]){
                return true;
            }
            return false;
        }
}