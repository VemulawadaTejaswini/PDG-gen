import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Int[] num = {reader.nextInt(), reader.nextInt(), reader.nextInt()};
        Arrays.sort(num);
        
        System.out.println(num[0] + " " + num[1] + " " + num[2]);
    }
}
