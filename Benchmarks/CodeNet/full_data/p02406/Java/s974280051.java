import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int x = 0;
        String str = "";
        Scanner sc = new Scanner(System.in);
        Check chk = new Check();
        x = sc.nextInt();
        for(int i=1;i<x+1;i++){
            if(chk.check3X(i)){
                str += " " + Integer.toString(i);
            }else if(chk.has3(i)){
                str += " " + Integer.toString(i);
            }
        }
        System.out.println(str);

    }
}

class Check{
    boolean check3X(int a){
        if(a%3==0){
            return true;
        }
        return false;
    }

    boolean has3(int a){
        String str =  Integer.toString(a);
         for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='3'){
                return true;
            }
        }
        return false;
    }
}