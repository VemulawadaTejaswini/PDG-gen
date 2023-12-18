import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//6/1コンテスト

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		String s = sc.next();
		String[] fruit = s.split("");
		String word=null;

        if(c<d) {
        	while(true) {
        		if(b==d) {
        			while(true) {
                		if(a==c) {
                			System.out.println("Yes");
                			break;
                		}
                		else {
                			if(fruit[a].equals(".")) {
                				a++;
                			}
                			else if(fruit[a+1].equals(".")) {
                				a=a+2;
                			}
                			else {
                				System.out.println("No");
                				break;
                			}
                		}

                	}
        			break;
        		}
        		else {
        			if(fruit[b].equals(".")) {
        				b++;
        			}
        			else if(fruit[b+1].equals(".")) {
        				b=b+2;
        			}
        			else {
        				System.out.println("No");
        				break;
        			}
        		}
        	}

        }
        else {
        	List<String> three=new ArrayList<String>();
        	for(int i =0;d-b-1>i;i++) {
        		three.add(fruit[b+i]);
        		word=word+three.get(i);
        		//System.out.println(word);
        	}
        	if(word.contains("...")) {
        		System.out.println("Yes");
        	}
        	else {
        		System.out.println("No");
        	}

        }

	}

}
