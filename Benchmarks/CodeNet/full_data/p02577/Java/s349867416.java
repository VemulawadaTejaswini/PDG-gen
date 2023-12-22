X  =  input().strip()  ;
t = 0 ;
for r in X : 
	t += int ( r ) ;

print ( "Yes" if t % 9 == 0 else "No" ) ;