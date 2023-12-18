import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String s;
        int[] n_w_s_e ={0,0,0,0};
        s=scan.next();
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'N':
                    n_w_s_e[0]+=1;
                    break;
                case 'W':
                    n_w_s_e[1]+=1;
                    break;
                case 'S':
                    n_w_s_e[2]+=1;
                    break;
                case 'E':
                    n_w_s_e[3]+=1;
                    break;
            }
        }
        if((n_w_s_e[0]!=0&&n_w_s_e[2]!=0)||(n_w_s_e[0]==0&&n_w_s_e[2]==0)){
            if((n_w_s_e[1]!=0&&n_w_s_e[3]!=0)||(n_w_s_e[1]==0&&n_w_s_e[3]==0)){
                System.out.println("Yes");
            }
            else System.out.println("No");
        }
        else System.out.println("No");
    }
}