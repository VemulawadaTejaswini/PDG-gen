import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] moji = new String[h+1];
        String moji2="";
        
        
        for(int i =0;i<w+2;i++){
             moji2+="#";
        }

        for(int i = 1;i<h+1;i++){
            moji[i] = "#"+sc.next()+"#";
        }

        for(int i = 0;i<h+2;i++){
            if(i==0){
                System.out.println(moji2);
            }else if(i==(h+1)){
                System.out.println(moji2);
            }else{
                System.out.println(moji[i]);
            }
        }
    }
}




