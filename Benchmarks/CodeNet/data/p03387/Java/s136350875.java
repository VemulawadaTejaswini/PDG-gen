import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        for(int i=0; i<3; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        if(a[2]*3 % 2 == (a[2]-a[0]+a[2]-a[1])%2){
            System.out.println((a[2]-a[0]+a[2]-a[1])/2);
        }else{
            System.out.println((a[2]+1-a[0]+a[2]+1-a[1]-1)/2); 
        }
    }
}
