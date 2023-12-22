import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int N = scan.nextInt();
			if(N == 0){
				break;
			}
			int[][] slide = new int[21][21];
			for(int i = 0;i < N;i++){
				slide[scan.nextInt()][scan.nextInt()] = 1;
			}
			int[] robot = new int[2];
			robot[0] = robot[1] = 10;
			int M = scan.nextInt();
			int count = 0;
			count += checkSlide(slide[robot[0]][robot[1]]);
			for(int i = 0;i < M;i++){
				String a = scan.next();
				int b = scan.nextInt();
				if(a.equals("N")){
					for(int j = 0;j < b;j++){
						robot[1] += 1;
						count += checkSlide(slide[robot[0]][robot[1]]);
					}
				}else if(a.equals("S")){
					for(int j = 0;j < b;j++){
						robot[1] -= 1;
						count += checkSlide(slide[robot[0]][robot[1]]);
					}
				}else if(a.equals("W")){
					for(int j = 0;j < b;j++){
						robot[0] -= 1;
						count += checkSlide(slide[robot[0]][robot[1]]);
					}
				}else{
					for(int j = 0;j < b;j++){
						robot[0] += 1;
						count += checkSlide(slide[robot[0]][robot[1]]);
					}
				}
			}
			if(count == N){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
	public static int checkSlide(int slide){
		return (slide == 1)? 1:0;
	}
}