<?php
	fscanf(STDIN,"%d %d",$n,$k);
	$s = fgets(STDIN);
	$s[$k-1] = strtolower($s[$k-1]);
	echo $s."\n";
?>