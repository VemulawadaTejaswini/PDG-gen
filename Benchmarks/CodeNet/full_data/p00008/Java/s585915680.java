import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int in = s.nextInt();
            int count = 0;
            for(int a=0; a<10; a++){
                for(int b=0; b<10; b++){
                    for(int c=0; c<10; c++){
                        for(int d=0; d<10; d++){
                            if((a+b+c+d)==in)
                                count++;
                        }
                    }
                }
            }
            System.out.println(count); 
        }
    }
}