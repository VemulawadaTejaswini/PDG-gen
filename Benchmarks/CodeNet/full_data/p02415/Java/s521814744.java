import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        String[] a=b.split("");
        
        for(int i=0;i<a.length;i++){
            if(Character.isUpperCase( a[i].charAt(0))){
                a[i]=a[i].toLowerCase();
            }else{
                a[i]=a[i].toUpperCase();
            }
        }
        for(int i=0;i<a.length;i++){
        	System.out.print(a[i]);
        }
        System.out.println();
    }
}

