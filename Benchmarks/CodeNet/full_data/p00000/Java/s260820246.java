public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
	}
	
	public static void show(){
		for(int i = 1;i <= 9;i++){
			for(int j = 1;j <= 9;j++){
				System.out.println(i + "x" + j + "=" + (i * j));
			}
		}
	}

}