import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int i,j;
        int ans = 0;
        int z=0;

        while(true){
            String x = sc.nextLine();
            if(x == "0") break;

            for(i=0;i < x.length();i++){
                char y = x.charAt(i);
                if(y == '0') z =0;
                if(y == '1') z =1;
                if(y == '2') z =2;
                if(y == '3') z =3;
                if(y == '4') z =4;
                if(y == '5') z =5;
                if(y == '6') z =6;
                if(y == '7') z =7;
                if(y == '8') z =8;
                if(y == '9') z =9; 
                ans =+ z;               

            }

        }

    }
}
