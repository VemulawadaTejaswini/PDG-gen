import java.util.Scanner;

class Main {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
    	//System.out.println("数字を入力してください");
    	Scanner sc = new Scanner(System.in);
    	int a = Integer.parseInt(sc.next());
    	int b = Integer.parseInt(sc.next());

    	if(a<b){
    		System.out.println("a"+"\t"+"<"+"\t"+"b");
    	}else if (a>b) {
    		System.out.println("a"+"\t"+">"+"\t"+"b");
		}else if (a==b) {
			System.out.println("a"+"\t"+"=="+"\t"+"b");
		}
    }
}
