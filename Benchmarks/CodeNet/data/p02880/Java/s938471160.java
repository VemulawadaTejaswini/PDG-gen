import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero,aux1=0,aux2=0;
        boolean sw=false;
        numero=sc.nextInt();
        for (int j = 1; j <9 ; j++) {
            for (int k = 1; k <9 ; k++) {
                if ((j*k)==numero){
                    aux1=j;
                    aux2=k;
                    sw=true;
                    break;
                }
            }
        }
        if (sw==true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
