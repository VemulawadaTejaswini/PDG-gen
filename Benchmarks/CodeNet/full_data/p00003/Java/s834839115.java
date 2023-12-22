import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<int[]> triangles = new ArrayList<int[]>();
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int dataNum = Integer.parseInt(br.readLine());
			for(int i=0;i<dataNum;i++){
				String[] lines = br.readLine().split(" ");
				int[] lineNums = {Integer.parseInt(lines[0]),Integer.parseInt(lines[1]),Integer.parseInt(lines[2])};
				triangles.add(lineNums);
			}
		}
		catch(Exception e){
			return;
		}
		
		for(int[] i : triangles){
			if(isRightTriangle(i[0], i[1], i[2])){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
	
	private static Boolean isRightTriangle(int a,int b,int c){
		return (a * a + b * b) == ( c * c);
	}
}