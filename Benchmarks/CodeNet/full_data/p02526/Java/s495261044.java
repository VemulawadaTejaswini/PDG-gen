  5         Scanner scan = new Scanner(System.in);
  6         int n = Integer.parseInt(scan.next());
  7         int[] S = new int[n];
  8         for( int i = 0; i < n; i++ ){
  9             S[i] = Integer.parseInt(scan.next());
 10         }
 11         int q = Integer.parseInt(scan.next());
 12         int[] T = new int[q];
 13         for( int i = 0; i < q; i++ ){
 14             T[i] = Integer.parseInt(scan.next());
 15         }
 16         int count = 0;
 17         for( int i = 0; i < q; i++ ){
 18             for( int j = 0; j < n; j++ ){
 19                 if( T[i] == S[j] ){
 20                     count++;
 21                 }
 22             }
 23         }
 24         System.out.println(count);
 25         return;
 26     }
 27 }