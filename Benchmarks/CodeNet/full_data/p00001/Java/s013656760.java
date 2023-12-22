class Main{
    public static void main(String[] a){
    	int mnt[] = {1819,
    				2003,
    				876,
    				2840,
    				1723,
    				1673,
    				3776,
    				2848,
    				1592,
    				922};
    	int max[] = {0,0,0};
    	int num[]={0,0,0};
    	
    	for(int i=0;i<mnt.length;i++){
    		if(max[0]<mnt[i]){
    			max[0]=mnt[i];
    			num[0]=i;
    		}
    	}
    	
    	for(int i=0;i<mnt.length;i++){
    		if(i!=num[0]&max[1]<mnt[i]){
    			max[1]=mnt[i];
    			num[1]=i;
    		}
    	}
    	
    	for(int i=0;i<mnt.length;i++){
    		if(i!=num[0]&i!=num[1]&max[2]<mnt[i]){
    			max[2]=mnt[i];
    		}
    	}
    	System.out.println(max[0]);
    	System.out.println(max[1]);
    	System.out.println(max[2]);
    }
}