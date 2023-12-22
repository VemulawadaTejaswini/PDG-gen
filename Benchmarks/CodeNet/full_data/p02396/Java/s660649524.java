package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		int intSub = -1;
		while(true){
			Scanner scan = new Scanner(System.in);
			intSub = scan.nextInt();
			if(intSub == 0){
				break;
			}else{
				list.add(intSub);
			}
		}
		for(int i = 0; i < list.size(); i++){
			System.out.println("Case " + (i + 1) + ": " + list.get(i));
		}

	}
}