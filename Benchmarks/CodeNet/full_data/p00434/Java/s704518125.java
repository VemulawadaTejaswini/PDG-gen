import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	boolean[] students = new boolean[30];
	int n = 0;

	while(sc.hasNext()){
	    n = sc.nextInt();
	    students[n-1] = true;
	}
	
	for(int i = 0;i<30;i++){
	    if(students[i]!=true){ System.out.println(i+1); }
	}
    }
}