
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.next();
        int a=0;
        int c=0;
        if(!string.startsWith("A")){
            System.out.println("WA");
            return;
        }
        boolean flag=false;
        for(int i=2;i<string.length();i++){
            if(string.charAt(i)=='C') {
                if(!flag){
                    c=i;
                    flag=true;
                }else{
                    System.out.println("WA");
                    return;
                }
            }
        }
        if(!flag){
            System.out.println("WA");
            return;
        }
        for(int i=0;i<string.length();i++){
            if(i==a||i==c) continue;
            char ch=string.charAt(i);
            if(Character.isUpperCase(ch)){
                System.out.println("WA");
                return;
            }
        }
        System.out.println("AC");



    }
}
