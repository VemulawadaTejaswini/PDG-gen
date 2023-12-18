import java.util.Scanner;
public class Main{
    
    public static void main (String[ ]args){
        
        Main main = new Main ();
        main.solve();
    }
    
    private void solve (){
        Scanner sc = new Scanner (System.in);

        String s = sc.next();
        
        char [] list = new char [s.length()];
        
        for (int index=0; index<s.length(); index++){
            list[index]=s.charAt(index);
        }
        
        boolean odd = true;
        int count1 = 0;
        for (int index=0; index<s.length();index++){
            if (odd){
                if (list[index]=='0'){
                    count1++;
                }
                odd=false;
            } else {
                if (list[index]=='1'){
                    count1++;
                }
                odd=true;
            }
        }
        odd=false;
        int count2=0;
        for (int index=0; index<s.length();index++){
            if (odd){
                if (list[index]=='0'){
                    count2++;
                }
                odd=false;
            } else {
                if (list[index]=='1'){
                    count2++;
                }
                odd=true;
            }
        }
        
        if (count1>count2){
            System.out.println(count2);
        } else {
            System.out.println(count1);
        }
    }
}