class practice1{
    public static void main(String[] args){
    int a[] = {1819, 2003, 876, 2840, 1723, 1673, 3776, 2848, 1592, 922};
    int b = a.length;
    int i, j, k;
    

    for(i = 0; i < b; i++)
    
    for(j = 0;j < b-1;j++) {
    	for(i = j+1;i < b;i++) {
    		if(a[j] < a[i]) {
    			k = a[j];
    			a[j] = a[i];
    			a[i] = k;
    		}
    	}
    }
    for(i = 0; i <= 2 ; i++)
    	System.out.println(a[i] + " ");
    System.out.println();
}
}