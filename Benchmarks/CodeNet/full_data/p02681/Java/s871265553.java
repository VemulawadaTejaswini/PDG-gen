import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        String a=stdIn.next();
        String b=stdIn.next();
        int sum=0;

        String []c=a.split("");
        String []d=b.split("");
        for(int i=0; i<c.length; i++){
            if(c[i].equals(d[i])){
                sum++;
            }
        }
        
        if(d.length-1==sum){
            System.out.println("Yes");
            
        }
        else{
            System.out.println("No");
            
        }
        
        
        
    }

}