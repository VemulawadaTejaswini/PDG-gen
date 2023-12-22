import java.util.*;
class Hello{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = x % 10;
        String z = "hon";
        if(y==3){
            z = "bon";
        }else if(x==0|x==1|x==6|x==8){
            z = "pon";
        }
        System.out.println(z);        
    }
}