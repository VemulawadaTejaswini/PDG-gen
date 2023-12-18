public class practive {
	public static int griditer(int r, int c, int [][]a) {

		int [][]mat = new int [r][c];
		mat[0][0] = 0;
		for(int i =1 ;i<r;i++) {
			if(a[i][0] == '.') {
				mat[i][0] = 1;
			}
			else if(a[i][0] == '#') {
				break;
			}
		}
		for(int j =1 ;j<c;j++) {
			if(a[0][j] == '.') {
				mat[0][j] = 1;
		}
			else if(a[0][j] == '#'){
				break;
			}
		}
		for(int i =1;i<r;i++) {
			for(int j =1;j<c;j++) {
				if(a[i][j] == '.') {
					mat[i][j] = mat[i-1][j] + mat[i][j-1];
				}
				else {
					mat[i][j] = 0;
				}
				
			}
			}
		return mat[r-1][c-1];
		
	}}