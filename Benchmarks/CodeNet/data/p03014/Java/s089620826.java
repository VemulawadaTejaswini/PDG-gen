import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int gyou = stdIn.nextInt();
        int retsu = stdIn.nextInt();
        String masu[][] = new String[gyou][retsu];
        int count = 0;
        int max = 0;
        int hikari = 0;
        //int doko = 0;
        
        for(int i = 0; i < gyou; i++){
            String s = stdIn.next();
            char c[] = s.toCharArray();
            
            for(int j = 0; j < retsu; j++){
                masu[i][j] = String.valueOf(c[j]);
            }
        }
        
        for(int i = 0; i < gyou; i++){
            for(int j = 0; j < retsu; j++){
                if(masu[i][j].equals(".")){
                    
                    hikari = 0;
                    for(int k = i - 1; k < gyou;){
                        
                        if(k < i){
                            if(k >= 0){
                                if(masu[k][j].equals(".")){
                                    hikari++;
                                    k--;
                                }else{
                                    k = i + 1;
                                }
                            }else{
                                k = i + 1;
                            }
                        }
                        
                        if(k > i){
                            if(k < gyou){
                                if(masu[k][j].equals(".")){
                                    hikari++;
                                    k++;
                                }else{
                                    break;
                                }
                            }
                        }
                    }
                    
                    count += hikari;
                    boolean flag = true;
                    if(count + retsu < max){
                        flag = false;
                    }
                    //System.out.print(count + " ");
                    if(flag){
                        hikari = 0;
                        for(int k = j - 1; k < retsu;){
                            if(k < j){
                                if(k >= 0){
                                    if(masu[i][k].equals(".")){
                                        hikari++;
                                        k--;
                                    }else{
                                        k = j + 1;
                                    }
                               }else{
                                   k = j + 1;
                               }
                            }
                            
                            if(k > j){
                                if(k < retsu){
                                    if(masu[i][k].equals(".")){
                                        hikari++;
                                        k++;
                                    }else{
                                        break;
                                    }
                                }
                            }
                        }
                        count += hikari;
                    }
                    
                    if(count + 1 > max){
                        max = count + 1;
                    }
                    
                    count = 0;
                }
            }
            //System.out.println();
        }
        
        //System.out.println(doko);
        System.out.println(max);
    }
}