import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String s;
        int[] n_w_s_e ={0,0,0,0};
        s=scan.next();
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case 'n':
                    n_w_s_e[0]+=1;
                    break;
                case 'w':
                    n_w_s_e[1]+=1;
                    break;
                case 's':
                    n_w_s_e[2]+=1;
                    break;
                case 'e':
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