import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.next();
        sc.nextLine();
        String str2 = sc.next();
        sc.nextLine();
        
        str1 += str1;
        int res = str1.indexOf(str2);
        if (res!=-1){
            System.out.println("Yes");  
        }else{
            System.out.println("No");   
        }
    }
}
