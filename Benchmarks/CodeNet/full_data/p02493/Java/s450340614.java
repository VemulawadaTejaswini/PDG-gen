mport java.util.*;
class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] list = new int[n];
    for(int i = 0; i<n; i++)list[i] = sc.nextInt();
    for(int i = 0; i<n; i++){ 
	System.out.print(list[n-i-1]);
	if(i != n-1)System.out.print(" ");
    }
    System.out.println();
    }
}