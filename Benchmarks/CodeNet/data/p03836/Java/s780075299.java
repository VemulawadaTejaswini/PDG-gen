import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int sx=stdIn.nextInt();
		int sy=stdIn.nextInt();
		int tx=stdIn.nextInt();
		int ty=stdIn.nextInt();
		int z=0;
		System.out.print("D");
		while((tx-sx)+1>z){
			System.out.print("R");
			z++;
		}z=0;
		while((ty-sy)+1>z){
			System.out.print("U");
			z++;
		}z=0;
		while((tx-sx)+1>z){
			System.out.print("L");
			z++;
		}z=0;
		while(ty-sy>z){
			System.out.print("D");
			z++;
		}z=0;
		System.out.print("L");
		while((ty-sy)+1>z){
			System.out.print("U");
			z++;
		}z=0;
		while((tx-sx)+1>z){
			System.out.print("R");
			z++;
		}z=0;
		while((ty-sy)+1>z){
			System.out.print("D");
			z++;
		}z=0;
		while(tx-sx>z){
			System.out.print("L");
			z++;
		}
	}
}