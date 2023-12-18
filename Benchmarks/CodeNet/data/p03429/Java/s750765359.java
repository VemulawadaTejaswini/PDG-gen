
import java.util.Scanner;



public class Main {

	public static int k=0;

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int amount = sc.nextInt();
        int height = sc.nextInt();
        int width = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        if( height*width % 2 == 1) {
        	System.out.println("NO");
        }else {

	        if( height*width > (A+B)*2) {
	        	System.out.println("NO");
	        }else {

	        	if(height % 2 == 0 && width % 2 == 0) {

	        		if(height*width == (A+B)*2 && A % 2 == 1) {

	        			System.out.println("NO");

	        		}else {

	        			System.out.println("Yes");

	        				if(A*2 > height * width) {
	        					for(int i=0;i<height;i++) {
	        						String buf = "";
	        						for(int j=0;j<width/2;j++) {
	        							buf = buf + "<>";
	        						}
	        						System.out.println(buf);
	        					}
	        				}else {

	        					int tmp1 = A / width;
	        					if(tmp1 % 2 == 1) {
	        						tmp1 = tmp1 -1;
	        					}


	        					String buf = "";

	        					for(int j=0;j<width/2;j++) {
        							buf = buf + "<>";
        						}

	        					for(int i=0;i<tmp1;i++) {

	        						System.out.println(buf);
	        					}

	        					int tmp2 = A - (tmp1 * width)/2;

	        					tmp2 = tmp2/2;

	        					buf = "";
	        					for(int i=0;i<tmp2;i++) {
	        						buf = buf + "<>";
	        					}
	        					String buf1 = buf;

	        					for(int i=0;i<(width -tmp2*2);i++) {
	        						buf = buf + "^";
	        						buf1 = buf1 + "v";
	        					}

	        					System.out.println(buf);
	        					System.out.println(buf1);

	        					int last = height - tmp1 -2;

	        					buf="";
	        					buf1="";

	        					for(int j=0;j<width;j++) {
	        						buf = buf +"^";
	        						buf1 = buf1 + "v";
	        					}

	        					for(int i=0;i<last/2;i++) {
	        						System.out.println(buf);
	        						System.out.println(buf1);
	        					}


	        				}


	        		}

	        	}else if(height % 2 == 1) {

	        		if(height*width == (A+B)*2 && A % 2 == 1) {

	        			System.out.println("NO");

	        		}else if(width/2 > A) {
	        			System.out.println("NO");
	        		}else {

	        			String buf = "";
	        			for(int i =0;i<width/2;i++) {
	        				buf = buf + "<>";
	        			}
	        			System.out.println(buf);

	        			height = height -1;

	        			int tmp1 = A / width;
    					if(tmp1 % 2 == 1) {
    						tmp1 = tmp1 -1;
    					}


    					buf = "";

    					for(int j=0;j<width/2;j++) {
							buf = buf + "<>";
						}

    					for(int i=0;i<tmp1;i++) {

    						System.out.println(buf);
    					}

    					int tmp2 = A - (tmp1 * width)/2;

    					tmp2 = tmp2/2;

    					buf = "";
    					for(int i=0;i<tmp2;i++) {
    						buf = buf + "<>";
    					}
    					String buf1 = buf;

    					for(int i=0;i<(width -tmp2*2);i++) {
    						buf = buf + "^";
    						buf1 = buf1 + "v";
    					}

    					System.out.println(buf);
    					System.out.println(buf1);

    					int last = height - tmp1 -2;

    					buf="";
    					buf1="";

    					for(int j=0;j<width;j++) {
    						buf = buf +"^";
    						buf1 = buf1 + "v";
    					}

    					for(int i=0;i<last/2;i++) {
    						System.out.println(buf);
    						System.out.println(buf1);
    					}



	        		}
	        	}else {

	        		if(height*width == (A+B)*2 && A % 2 == 1) {

	        			System.out.println("NO");

	        		}else if(height/2 > B) {
	        			System.out.println("NO");
	        		}else {

	        			String buf ="^";
	        			String buf1 ="v";

	        			int tmp1 = A / (width-1);
	        			if(tmp1 % 2 == 1) {
	        				tmp1 -= 1;
	        			}

	        			for(int i=0;i<(width-1)/2;i++) {
	        				buf = buf + "<>";
	        				buf1 = buf1 + "<>";
	        			}

	        			for(int i=0;i<tmp1/2;i++) {
	        				System.out.println(buf);
	        				System.out.println(buf1);
	        			}

	        			int tmp2 = (width -1)*tmp1 /2;
	        			tmp2 = A - tmp2;

	        			if(tmp2 % 2 == 1) {
	        				tmp2 -= 1;
	        			}

	        			buf = "^";
	        			buf1 = "v";

	        			for(int i=0; i < tmp2/2;i++) {
	        				buf = buf + "<>";
	        				buf1 = buf1 + "<>";
	        			}

	        			for(int i=0; i<(width-1)-tmp2;i++) {
	        				buf = buf + "^";
	        				buf1 = buf1 + "v";
	        			}

	        			System.out.println(buf);

	        			System.out.println(buf1);


	        			int k =  height - tmp1 - 2;

	        			buf = "";
	        			buf1 = "";

	        			for(int i=0;i<width;i++) {
	        				buf = buf + "^";
	        				buf1 =  buf1 + "v";
	        			}

	        			for(int i=0;i<k/2;i++) {
	        				System.out.println(buf);
	        				System.out.println(buf1);
	        			}


	        		}
	        	}

	        }


        }


    }



}


