import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        
        int[] s = new int[n+1];
        for(int i=0; i<n; i++){
            String line = sc.next();
            if("AB".equals(line)){
                s[i] = 0;
            }else if("AC".equals(line)){
                s[i] = 1;
            }else{
                s[i] = 2;
            }
        }
        
        char[] ans = new char[n];
        for(int i=0; i<n; i++){
            if(s[i] == 0){
                //AB
                if(a==0 && b==0){
                    no(a,b,c);
                }else if(a == b){
                    if(s[i+1] == 1){
                        ans[i] = 'A';
                        a++;
                        b--;
                    }else{
                        ans[i] = 'B';
                        b++;
                        a--;
                    }
                }else if(a < b){
                    ans[i] = 'A';
                    a++;
                    b--;
                }else{
                    ans[i] = 'B';
                    b++;
                    a--;
                }
            }else if(s[i] == 1){
                //AC
                if(a==0 && c==0){
                    no(a,b,c);
                }else if(a == c){
                    if(s[i+1] == 0){
                        ans[i] = 'A';
                        a++;
                        c--;
                    }else{
                        ans[i] = 'C';
                        c++;
                        a--;
                    }
                }else if(a < c){
                    ans[i] = 'A';
                    a++;
                    c--;
                }else{
                    ans[i] = 'C';
                    c++;
                    a--;
                }
            }else{
                //BC
                if(b==0 && c==0){
                    no(a,b,c);
                }else if(b == c){
                    if(s[i+1] == 0){
                        ans[i] = 'B';
                        b++;
                        c--;
                    }else{
                        ans[i] = 'C';
                        c++;
                        b--;
                    }
                }else if(b < c){
                    ans[i] = 'B';
                    b++;
                    c--;
                }else{
                    ans[i] = 'C';
                    c++;
                    b--;
                }
            }
        }
        
        System.out.println("Yes");
        for(int i=0; i<n; i++){
            System.out.println(ans[i]+"");
        }
    }
    
    public static void no(int a, int b, int c){
        //System.out.println(a + " " + b +  " " + c);
        
        System.out.println("No");
        System.exit(0);
    }
}
