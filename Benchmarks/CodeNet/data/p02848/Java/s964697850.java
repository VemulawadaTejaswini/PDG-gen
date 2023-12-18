
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.print(change(str,n));
        
    }
    static String change(String str,int n){
        char[] strary = str.toCharArray();
        for(int i = 0;i < strary.length;i++){
            for(int j = 0;j < n;j++){
                if(strary[i] == 'A'){
                    strary[i] = 'B';
                } else if(strary[i] == 'B'){
                    strary[i] = 'C';
                } else if(strary[i] == 'C'){
                    strary[i]  = 'D';
                } else if(strary[i] == 'D'){
                    strary[i] = 'E';
                } else if(strary[i] == 'E'){
                    strary[i]  = 'F';
                }else if(strary[i] == 'F'){
                    strary[i] = 'G';
                } else if(strary[i] == 'G'){
                    strary[i]  = 'H';
                }else if(strary[i] == 'H'){
                    strary[i] = 'I';
                } else if(strary[i] == 'I'){
                    strary[i]  = 'J';
                }else if(strary[i] == 'J'){
                    strary[i] = 'K';
                } else if(strary[i] == 'K'){
                    strary[i]  = 'L';
                }else if(strary[i] == 'L'){
                    strary[i] = 'M';
                } else if(strary[i] == 'M'){
                    strary[i]  = 'N';
                }else if(strary[i] == 'N'){
                    strary[i] = 'O';
                } else if(strary[i] == 'O'){
                    strary[i]  = 'P';
                }else if(strary[i] == 'P'){
                    strary[i] = 'Q';
                } else if(strary[i] == 'Q'){
                    strary[i]  = 'R';
                }else if(strary[i] == 'R'){
                    strary[i] = 'S';
                } else if(strary[i] == 'S'){
                    strary[i]  = 'T';
                }else if(strary[i] == 'T'){
                    strary[i] = 'U';
                } else if(strary[i] == 'U'){
                    strary[i]  = 'V';
                }else if(strary[i] == 'V'){
                    strary[i] = 'W';
                } else if(strary[i] == 'W'){
                    strary[i]  = 'X';
                }else if(strary[i] == 'X'){
                    strary[i] = 'Y';
                } else if(strary[i] == 'Y'){
                    strary[i]  = 'Z';
                }else if(strary[i] == 'Z'){
                    strary[i] = 'A';
                } 
            }
        }   
        String ans="";
        for(int i = 0;i < strary.length;i++)ans += strary[i];
        return ans;
    }
    
}
