import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        long X = sc.nextLong();
        int count=0;
        long base=100;
        for(int i=0;true;i++){
            if(base>=X){
                break;
            }
            else{
                base=base+(base/100);
                count++;
            }
        }
        System.out.println(count);
    }
}