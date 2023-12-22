import java.io.BufferedReader;

class Main{
    public static void main(String[] args) throws IOException{
	        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	        int [] mountainsheight= new int[10];
	        for(int i = 0; i < 10; i++){
	        	mountainsheight[i]=Integer.parseInt(br.readLine());
	        }
	        Arrays.sort(mountainsheight);
	        for(int i = 9; i > 6; i--){
	            System.out.println(mountainsheight[i]);
	        }       
	}
}