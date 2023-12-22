= sc.nextInt();
			final int b = sc.nextInt();
			final int c = sc.nextInt();
			final int d = sc.nextInt();
			
			for(int j = a; j <= X_MAX; j++){
				for(int k = 0; k <= 2 * Y_MAX - b; k++){
					if(DP[j][k] < 0){ continue; }
					nextDP[j - a][k + b] = Math.max(DP[j - a][k + b], DP[j][k]);
				}
			}
			
			for(int j = 0; j <= X_MAX; j++){
				for(int k = c; k <= 2 * Y_MAX - c; k++){
					if(DP[j][k] < 0){ continue; }
					
					nextDP[j][k - c] = Math.max(DP[j][k - c], DP[j][k] + d);
				}
			}
			
			{
				int[][] tmp = DP;
				DP = nextDP;
				nextDP = tmp;
			}
		}