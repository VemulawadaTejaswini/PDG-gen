import java.util.Scanner;

class Main {
    
    int a,b;
    
    public void suzuki(){
        
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        
        if(a < b){
            System.out.print("a < b");
        }else if(a > b){
            System.out.print("a > b");
        }else{
            System.out.print("a == b");
        }
    }
    public static void main(String[] args){
        
        new Main().suzuki();
    }
}