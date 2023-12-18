import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sumCode_1=0;
        int sumCode_2=0;
        int add=0;
        String[] s = new String[n];
        for (int i =0; i < n ;i++ ){ 
            s[i] = scan.next();
        }
       
       for(int i =0 ; i<n ; i++){
           for (int l=0;l<n ;l++ ){
               if (i==l){
                   continue;
               }else{}
               
               if(s[i].length() != s[l].length()){
               continue;
               }else{}
               
                for(int j=0;j<s[i].length();j++){
                sumCode_1 += s[i].charAt(j);
                }
                for(int j=0;j<s[l].length();j++){
                sumCode_2 += s[l].charAt(j);
                }
                if(sumCode_1 == sumCode_2){
                  add = add +1;  
                }
            }
        }
        System.out.println(add/2);
    }
}
