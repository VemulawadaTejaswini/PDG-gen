import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String white = ".";
        String black = "#";
        // always let A denote the smaller value
        if(A>B){
            int C = A;
            A = B;
            B = C;
            white = "#";
            black = ".";
        }
        int line1 = (A-1)/50;
        int blackDone = 1;
        if(line1>=1) blackDone+=50*(line1-1);
        int blackRemain = B-blackDone;
        int line2 = (blackRemain-1)/50;

        int h = 0;
        if(line1>=1) h += line1-1;
        h += 3;
        h += 2*line2;
        h += 2;

        int w = 100;
        System.out.println(Integer.toString(h)+" "+Integer.toString(w));



        StringBuilder sbOdd= new StringBuilder();
        StringBuilder sbEven = new StringBuilder();
        for(int i=1;i<=50;i++){
            sbOdd.append(white);
            sbOdd.append(black);
            sbEven.append(black);
            sbEven.append(white);
        }
        String odd = sbOdd.toString();
        String even = sbEven.toString();
        String[] dic = new String[]{even,odd};
        for(int i=1;i<=line1-1;i++){
            System.out.println(dic[i%2]);
        }

        StringBuilder divide = new StringBuilder();
        StringBuilder divideWhite = new StringBuilder();
        for(int i=1;i<=100;i++) {
            divide.append(black);
            divideWhite.append(white);
        }
        System.out.println(divide.toString());

        StringBuilder sbLastWhite = new StringBuilder();
        for(int i=1;i<=A-50*line1-1;i++){
            sbLastWhite.append(black);
            sbLastWhite.append(white);
        }
        for(int i=(A-50*line1-1)*2+1;i<=100;i++) sbLastWhite.append(black);
        System.out.println(sbLastWhite.toString()); // here A-1 white has been finished
        System.out.println(divide.toString());

        for(int i=1;i<=line2;i++){
            System.out.println(divideWhite.toString());
            System.out.println(dic[0]);
        }
        System.out.println(divideWhite.toString());
        StringBuilder sbLastBlack = new StringBuilder();
        for(int i=1;i<=blackRemain-50*line2;i++){
            sbLastBlack.append(black);
            sbLastBlack.append(white);
        }
        for(int i=2*(blackRemain-50*line2)+1;i<=100;i++) sbLastBlack.append(white);
        System.out.println(sbLastBlack.toString());




        //System.out.println(ans);
    }
}
