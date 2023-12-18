import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
        
        //指定した文字列が存在するか確認
        if (str.contains("AC"))
        {
            System.out.println("AC");
        } else {
        	System.out.println("No");
        }
	}
	
	
}