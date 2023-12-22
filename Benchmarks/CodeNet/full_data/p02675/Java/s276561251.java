import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = x % 10;
        String z = "hon";
        if(y==3){
            z = "bon";
        }else if(y==0|y==1|y==6|y==8){
            z = "pon";
        }
        System.out.println(z);        
    }
}