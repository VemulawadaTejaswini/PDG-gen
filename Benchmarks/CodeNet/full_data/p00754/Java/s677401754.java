import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        char[] c = new char[100];
        int breakkeep, judge;
        while(true){
            int lmaru=0, rmaru=0, lkaku=0, rkaku=0, countlm=0, countrm=0, countlk=0, countrk=0, k=0, m=0;
            int[] locm = new int[100];
            int[] lock = new int[100];
            for(int i=0;i<100;i++){
                locm[i] = -1;
                lock[i] = -1;
            }
            breakkeep = 0;
            judge = 0;
            while(true){
                str = sc.nextLine();
                for(int i=0;i<str.length();i++){
                    c[i] = str.charAt(i);
                    if(c[i]=='.') breakkeep++;
                    judge = i;
                }
                if(breakkeep != 0) break;
            }
            if(judge == 0) break;
            for(int i=0;i<=judge;i++){
                if(c[i]=='('){
                    lmaru++;
                    countlm++;
                    m++;
                    locm[m] = i;
                }
                if(c[i]==')'){
                   countrm++;
                   if(locm[m] > lock[k] && lmaru > rmaru){
                       m--;
                       rmaru++;
                   }
                }
                if(c[i]=='['){
                    lkaku++;
                    countlk++;
                    k++;
                    lock[k] = i;
                }
                if(c[i]==']'){
                    countrk++;
                    if(lock[k] > locm[m] && lkaku > rkaku){
                        rkaku++;
                        k--;
                    }
                }
            }
            if((lmaru == rmaru && countlm == countrm) && (lkaku == rkaku && countlk == countrk)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
