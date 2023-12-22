import java.util.Scanner;

class Main{

    public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	while(true){

	    int n = scan.nextInt();
	    int k = scan.nextInt();

	    if(n == 0 || k == 0){
		break;
	    }

	    int datal = 0;
	    int them;

	    String s1;
	    //ツつアツつアツつゥツづァ

	    	    
	    int start = 1;
	    if(n > 99288889){
		datal = 99288889;
		start = 13800000;
	    }else if(n > 98488889){
		datal = 98488889;
		start = 13700000;
	    }else if(n > 97688889){
		datal = 97688889;
		start = 13600000;
	    }else if(n > 96888889){
		datal = 96888889;
		start = 13500000;
	    }else if(n > 96088889){
		datal = 96088889;
		start = 13400000;
	    }else if(n > 95288889){
		datal = 95288889;
		start = 13300000;
	    }else if(n > 94488889){
		datal = 94488889;
		start = 13200000;
	    }else if(n > 93688889){
		datal = 93688889;
		start = 13100000;
	    }else if(n > 92888889){
		datal = 92888889;
		start = 13000000;
	    }else if(n > 92088889){
		datal = 92088889;
		start = 12900000;
	    }else if(n > 91288889){
		datal = 91288889;
		start = 12800000;
	    }else if(n > 90488889){
		datal = 90488889;
		start = 12700000;
	    }else if(n > 89688889){
		datal = 89688889;
		start = 12600000;
	    }else if(n > 88888889){
		datal = 88888889;
		start = 12500000;
	    }else if(n > 88088889){
		datal = 88088889;
		start = 12400000;
	    }else if(n > 87288889){
		datal = 87288889;
		start = 12300000;
	    }else if(n > 86488889){
		datal = 86488889;
		start = 12200000;
	    }else if(n > 85688889){
		datal = 85688889;
		start = 12100000;
	    }else if(n > 84888889){
		datal = 84888889;
		start = 12000000;
	    }else if(n > 84088889){
		datal = 84088889;
		start = 11900000;
	    }else if(n > 83288889){
		datal = 83288889;
		start = 11800000;
	    }else if(n > 82488889){
		datal = 82488889;
		start = 11700000;
	    }else if(n > 81688889){
		datal = 81688889;
		start = 11600000;
	    }else if(n > 80888889){
		datal = 80888889;
		start = 11500000;
	    }else if(n > 80088889){
		datal = 80088889;
		start = 11400000;
	    }else if(n > 79288889){
		datal = 79288889;
		start = 11300000;
	    }else if(n > 78488889){
		datal = 78488889;
		start = 11200000;
	    }else if(n > 77688889){
		datal = 77688889;
		start = 11100000;
	    }else if(n > 76888889){
		datal = 76888889;
		start = 11000000;
	    }else if(n > 7608889){
		datal = 76088889;
		start = 10900000;
	    }else if(n > 75288889){
		datal = 75288889;
		start = 10800000;
	    }else if(n > 74488889){
		datal = 74488889;
		start = 10700000;
	    }else if(n > 73688889){
		datal = 73688889;
		start = 10600000;
	    }else if(n > 72888889){
		datal = 72888889;
		start = 10500000;
	    }else if(n > 72088889){
		datal = 72088889;
		start = 10400000;
	    }else if(n > 71288889){
		datal = 71288889;
		start = 10300000;
	    }else if(n > 70488889){
		datal = 70488889;
		start = 10200000;
	    }else if(n > 69688889){
		datal = 69688889;
		start = 10100000;
	    }else if(n > 68888889){
		datal = 68888889;
		start = 10000000;
	    }else if(n > 5888889){
		datal = 5888889;
		start = 100000;
	    }else if(n > 488889){
		datal = 488889;
		start = 100000;
	    }else if(n > 38889){
		datal = 38889;
		start = 10000;
	    }else if(n > 2889){
		datal = 2889;
		start = 1000;
	    }else if(n > 189){
		datal = 189;
		start = 100;
	    }else if(n > 9){
		datal += 9;
		start = 10;
	    }	   
	    //System.out.println("datal = "+ datal);
	    
	    for(int i = start;; i++){
		s1 = String.valueOf(i);
		datal += s1.length();

		if(n <= datal){
		    them = i;
		    s1 = String.valueOf(i);


		    //System.out.println("n = " + n);
		    //System.out.println("them = " + them);
		    // System.out.println("datal = " + datal);

		    break;
		}
	    }

	    //ツつアツつアツづ慊づづーツ陛渉更

	    int disp = 0;

	    for(int i = s1.length()-(datal - n)-1; i < s1.length(); i++){
		System.out.print(s1.charAt(i));
		disp++;
		if(disp == k){
		    break;
		}
	    }

	    if(disp == k){
		System.out.println();
		continue;
	    }


	    int check = 0;

	    for(int i = them+1;;i++){
		s1 = String.valueOf(i);
		for(int j = 0; j < s1.length();j++){
		    System.out.print(s1.charAt(j));
		    disp++;
		    if(disp == k){
			check = -1;
			break;
		    }

		}

		if(check == -1) break;
	    }

	    System.out.println();
	    

	}
    }
}