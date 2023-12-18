import java.util.*;
public class Main{

 public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] choice = s.split("");
        int length = s.length();
        int[] childlen = new int[length];
        int[] tmpChild = new int[length];

        int rNum = 0;
        int lNum = 0;
        for(int i=0;i<length;i++){
            if(choice[i].equals("R")){
                rNum++;
            }else{
                lNum++;
            }
        }
        int sa = (int)Math.abs(rNum - lNum) + 1;

        if(sa%2==0){
            sa = sa;
        }else{
            sa = sa+1;
        }

        for(int i=0;i<length;i++){
            childlen[i] = 1;
            tmpChild[i] = 1;
        }

        for(long j=0;j<sa;j++){
            for(int i=0;i<length;i++){
                if(choice[i].equals("R")){
                    childlen[i+1] = childlen[i+1] + tmpChild[i];
                    childlen[i] = childlen[i] - tmpChild[i];
                }else{
                    childlen[i-1] = childlen[i-1] + tmpChild[i];
                    childlen[i] = childlen[i] - tmpChild[i];
                }
            }
            for(int i=0;i<length;i++){
                tmpChild[i] = childlen[i];
            }      
        }
        for(int i=0;i<length;i++){
            System.out.print(childlen[i] + " ");
        }   
        System.out.println();
    }

}