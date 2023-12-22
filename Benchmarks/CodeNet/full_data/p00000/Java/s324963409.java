

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				sb.delete(0, sb.length());
				System.out.println(sb.append(i+1).append('x').append(j+1).append('=').append((i+1)*(j+1)));
			}
		}
	}
}