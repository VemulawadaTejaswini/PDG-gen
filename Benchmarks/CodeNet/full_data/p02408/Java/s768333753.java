import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        int i,num;
        int a;
        int[] s = new int[13];
        int[] h = new int[13];
        int[] c = new int[13];
        int[] d = new int[13];
        str = scan.nextLine();
        a = Integer.valueOf(str);
        for(i = 0; i < a; i++){
            str = scan.nextLine();
            String[] card = str.split(" ", 0);
            num = Integer.valueOf(card[1]);
            switch(card[0]){
                case "S":
                    s[num-1] = 1;
                    break;
                case "H":
                    h[num-1] = 1;
                    break;
                case "C":
                    c[num-1] = 1;
                    break;
                case "D":
                    d[num-1] = 1;
                    break;
            }
        }

        for(i = 0; i < 13; i++){
            if(s[i] != 1){
                System.out.println("S "+(i+1));
            }
        }
        for(i = 0; i < 13; i++){
            if(h[i] != 1){
                System.out.println("H "+(i+1));
            }
        }
        for(i = 0; i < 13; i++){
            if(c[i] != 1){
                System.out.println("C "+(i+1));
            }
        }
        for(i = 0; i < 13; i++){
            if(d[i] != 1){
                System.out.println("D "+(i+1));
            }
        }
        //System.out.println();
        scan.close();
    }
}
