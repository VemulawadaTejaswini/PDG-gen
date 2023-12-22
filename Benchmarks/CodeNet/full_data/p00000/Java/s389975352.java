package java;

public class Main {
static int i;
static int j;
static int a;
	public static void main(String[] args) {
		for(i=0;i<9;i++){
			for(j=0;j<9;j++){
				a=i*j;
				System.out.println(i+"x"+j+"="+a);
			}
		}

	}

}