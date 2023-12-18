import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x= sc.nextLong();
        long happinessCount = 0;
        while (x>4){
            if(x>=500){
                happinessCount += 1000;
                x -= 500;
            }else {
                happinessCount += 5;
                x -= 5;
            }
        }
        System.out.println(happinessCount);
    }
}