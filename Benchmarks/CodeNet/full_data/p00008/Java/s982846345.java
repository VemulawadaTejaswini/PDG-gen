import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for(int a=0;a<=9;a++){
            for(int b=0;b<=9;b++){
                for(int c=0;c<=9;c++){
                    for(int d=0;d<=9;d++){
                        if((a+b+c+d)==n){answer++;}
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
