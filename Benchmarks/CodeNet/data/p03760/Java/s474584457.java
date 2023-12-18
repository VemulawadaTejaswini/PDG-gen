import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] o = sc.next().toCharArray();
        char[] e = sc.next().toCharArray();
        if(o.length==e.length){
            for(int i = 0;i<o.length;i++){
                System.out.print(o[i]);
                System.out.print(e[i]);
            }
        } else {
          int j = 0;  
          for(int i = 0;i<e.length;i++){
                System.out.print(o[i]);
                System.out.print(e[i]);
           		j = i+1;
            }
            System.out.print(o[j]);
        }
    }
}