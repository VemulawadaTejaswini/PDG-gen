import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int N=sc.nextInt();
        int acCount=0;
        int waCount=0;
        int tleCount=0;
        int reCount=0;
        
        String[] moziretu=new String[N];
        
        for(int i=0;i<N;i++){
            moziretu[i]=sc.next();    
        }
        
        for(int i=0;i<moziretu.length;i++){
            if(moziretu[i].equals("AC")){
                acCount++;
            }else if(moziretu[i].equals("WA")){
                waCount++;
            }else if(moziretu[i].equals("TLE")){
                tleCount++;
            }else if(moziretu[i].equals("RE")){
                reCount++;
            }
        }
        System.out.println("AC x "+acCount);
        System.out.println("WA x "+waCount);
        System.out.println("TLE x "+tleCount);
        System.out.println("RE x "+reCount);
	}
}