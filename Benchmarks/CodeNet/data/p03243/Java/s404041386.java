import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num = stdIn.nextInt();
        num = swap(num);
        System.out.println(num);
    }
    static int swap(int num){
        int j,k,l;
        j = num/100;
        k = (num%100)/10;
        l = num%10;
        if(j >= k && j >= l){
            return (j*100+j*10+j);
        }
        if(j < k || j < l){
            return ((j+1)*100+(j+1)*10+(j+1));
        }
        return (j*100+j*10+j);
    }
}